# Base image
FROM node:22-alpine

# Setting working directory
WORKDIR /app

# Install dependencies
COPY package.json yarn.lock ./
RUN yarn install --frozen-lockfile

# Copy application files
COPY . .

# Generate build
RUN yarn build 

# Expose application port
EXPOSE 3000

# Run the application
CMD ["yarn", "start"]
